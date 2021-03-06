package com.ymjia.demo.application.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author 1
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RefundResult extends QrNoticeCommonIn {

    private static final long serialVersionUID = 1316289687029632786L;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund_result.status
     *
     * @mbg.generated
     */
    @NotBlank(message = "status不可为空")
    private String status;

}