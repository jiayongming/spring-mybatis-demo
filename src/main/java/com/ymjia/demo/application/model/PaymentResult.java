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
public class PaymentResult extends QrNoticeCommonIn {

    private static final long serialVersionUID = -241189257838910451L;
    private Byte notificationType = 2 ;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_result.status
     *
     * @mbg.generated
     */
    @NotBlank(message = "status不可为空")
    private String status;

    private String orderDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_result.voucher_no
     *
     * @mbg.generated
     */
    private String voucherNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_result.real_amt
     *
     * @mbg.generated
     */
    @NotBlank(message = "realAmt不可为空")
    private String realAmt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_result.disc_amt
     *
     * @mbg.generated
     */
    @NotBlank(message = "discAmt不可为空")
    private String discAmt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_result.coupon_id
     *
     * @mbg.generated
     */
    private String couponId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_result.coupon_desc
     *
     * @mbg.generated
     */
    private String couponDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_result.coupon_type
     *
     * @mbg.generated
     */
    private String couponType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_result.payee_id
     *
     * @mbg.generated
     */
    private String payeeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_result.payee_name
     *
     * @mbg.generated
     */
    private String payeeName;

}