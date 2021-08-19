package com.jieve.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

/**
 * @author Jieve
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanRequest {

    private Long id;

    private Long userId;

    private String planName;

    private String startDate;

    private String endDate;

    public boolean createValidate() {
        return this.userId != null
                && StringUtils.isNotBlank(planName)
                && StringUtils.isNotBlank(startDate)
                && StringUtils.isNotBlank(endDate)
                ;
    }

    public boolean updateValidate() {
        return this.userId != null && this.id != null;
    }

    public boolean deleteValidate() {
        return this.userId != null && this.id != null;
    }
}
