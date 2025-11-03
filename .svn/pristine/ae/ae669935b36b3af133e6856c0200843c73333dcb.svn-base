package com.msp.DbConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
@EnableJpaRepositories(entityManagerFactoryRef = "mspPmsentityManagerFactory", transactionManagerRef = "mspPmsTransactionManager", basePackages = "com.msp.pms.msppmsrepository" )
//@EnableJpaRepositories(entityManagerFactoryRef = "mosipPmsEntityManagerFactory", transactionManagerRef = "mosipTransactionManager", basePackages = {
//        "com.msp.mosip_pms.repository"})
public class PMS {
    File propertyFile;

    public void OSCheck() {
        String command = "";
        String sOsName = System.getProperty("os.name");

        if (sOsName.startsWith("Windows")) {
            System.out.println("WINDOWS OS");
            String filePath = new FileSystemResource("").getFile().getAbsolutePath();
            propertyFile = new File(filePath+"/PMS.conf");
            System.out.println("filepath :"+filePath);
        } else {

            if ((sOsName.startsWith("Linux")) || (sOsName.startsWith("Mac")) || (sOsName.startsWith("HP-UX"))) {
                System.out.println("LINUX OS");
                File catalinaBase = new File(System.getProperty("catalina.base")).getAbsoluteFile();
                propertyFile = new File(catalinaBase, "bin/PMS.conf");
            } else {
                System.out.println("The current operating system '" + sOsName + "' is not supported.");
            }
        }
    }
    @Primary
    @Bean(name = "Pms")
    public DataSource dataSource() {
        OSCheck();
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        try {
            InputStream in = new FileInputStream(propertyFile);
            ResourceBundle resource = new PropertyResourceBundle(in);
            dataSource.setDriverClassName("org.postgresql.Driver");
            dataSource.setUrl(resource.getString("db2.url"));
            dataSource.setUsername(resource.getString("db2.username"));
            dataSource.setPassword(resource.getString("db2.password"));
            System.out.println("********************************************************************");
            System.out.println(resource.getString("db2.url"));
            System.out.println("********************************************************************");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
    @Primary
    @Bean(name = "mspPmsentityManagerFactory")
    public LocalContainerEntityManagerFactoryBean barEntityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("Pms") DataSource dataSource) {
        return builder.dataSource(dataSource).packages("com.msp.pms.msppmsmodel").persistenceUnit("PMS")
                .build();
    }
    @Primary
    @Bean(name = "mspPmsTransactionManager")
    public PlatformTransactionManager barTransactionManager(
            @Qualifier("mspPmsentityManagerFactory") EntityManagerFactory barEntityManagerFactory) {
        return new JpaTransactionManager(barEntityManagerFactory);
    }


}
