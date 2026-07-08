package com.msp.DbConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

@Configuration
@EnableTransactionManagement
@EnableAutoConfiguration
@EnableJpaRepositories(entityManagerFactoryRef = "moispkeymangentityManagerFactory", transactionManagerRef = "moispkeymangTransactionManager", basePackages = "com.msp.keymanager.moispkeymangrepository" )
public class KeyManager {
    File propertyFile;
    ResourceBundle resource = null;

//    public void OSCheck() {
//        String command = "";
//        String sOsName = System.getProperty("os.name");
//
//        if (sOsName.startsWith("Windows")) {
//            System.out.println("WINDOWS OS");
//            String filePath = new FileSystemResource("").getFile().getAbsolutePath();
//            propertyFile = new File(filePath+"/PMS.conf");
//            System.out.println("filepath :"+filePath);
//        } else {
//
//            if ((sOsName.startsWith("Linux")) || (sOsName.startsWith("Mac")) || (sOsName.startsWith("HP-UX"))) {
//                System.out.println("LINUX OS");
//                File catalinaBase = new File(System.getProperty("catalina.base")).getAbsoluteFile();
//                propertyFile = new File(catalinaBase, "bin/PMS.conf");
//            } else {
//                System.out.println("The current operating system '" + sOsName + "' is not supported.");
//            }
//        }
//    }


    public void OSCheck() {
        try {
            ClassPathResource pmsRes = new ClassPathResource("PMS.conf");

            try (InputStream is1 = pmsRes.getInputStream()) {

                resource = new PropertyResourceBundle(is1);
            }

            System.out.println("✅ Config files loaded from classpath");

        } catch (Exception e) {
            throw new RuntimeException("❌ Failed to load config files from resources", e);
        }
    }


    //    @Primary
    @Bean(name = "keyManag")
    public DataSource dataSource() {
        OSCheck();
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        try {
//            InputStream in = new FileInputStream(propertyFile);
//            ResourceBundle resource = new PropertyResourceBundle(in);
            dataSource.setDriverClassName("org.postgresql.Driver");
            dataSource.setUrl(resource.getString("db3.url"));
            dataSource.setUsername(resource.getString("db3.username"));
            dataSource.setPassword(resource.getString("db3.password"));
            System.out.println("********************************************************************");
            System.out.println(resource.getString("db3.url"));
            System.out.println("********************************************************************");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
//    @Primary
    @Bean(name = "moispkeymangentityManagerFactory")
    public LocalContainerEntityManagerFactoryBean barEntityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("keyManag") DataSource dataSource) {
        return builder.dataSource(dataSource).packages("com.msp.keymanager.moispkeymanagermodel").persistenceUnit("KeyManager")
                .build();
    }
//    @Primary
    @Bean(name = "moispkeymangTransactionManager")
    public PlatformTransactionManager barTransactionManager(
            @Qualifier("moispkeymangentityManagerFactory") EntityManagerFactory barEntityManagerFactory) {
        return new JpaTransactionManager(barEntityManagerFactory);
    }

}
