package com.msp.Bean;

import com.msp.pms.msppmsmodel.MSPFeatureMaster;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleBasedMenuBean {
    private ArrayList<MSPFeatureMaster> parentId;
    private ArrayList<MSPFeatureMaster> childParentId;
    private ArrayList<MSPFeatureMaster> childSubMenuId;
}
