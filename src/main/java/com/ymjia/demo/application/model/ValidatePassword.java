package com.ymjia.demo.application.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 1
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ValidatePassword extends QrNoticeCommonIn {

    private static final long serialVersionUID = -895276146577726882L;

    private Byte notificationType = 1 ;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column validate_password.send_result
     *
     * @mbg.generated
     */
    private Short sendResult;

}