package com.ymjia.demo.application.mapper;

import com.ymjia.demo.application.example.RefundResultExample;
import com.ymjia.demo.application.model.RefundResult;
import com.ymjia.demo.application.sqlprovider.RefundResultSqlProvider;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface RefundResultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table refund_result
     *
     * @mbg.generated
     */
    @SelectProvider(type=RefundResultSqlProvider.class, method="countByExample")
    long countByExample(RefundResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table refund_result
     *
     * @mbg.generated
     */
    @DeleteProvider(type=RefundResultSqlProvider.class, method="deleteByExample")
    int deleteByExample(RefundResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table refund_result
     *
     * @mbg.generated
     */
    @Delete({
        "delete from refund_result",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table refund_result
     *
     * @mbg.generated
     */
    @Insert({
        "insert into refund_result (id, version, ",
        "trade_type, inst_code, ",
        "request_sn, time_stamp, ",
        "encrypt_data, signature, ",
        "orig_order_id, orig_request_sn, ",
        "status, amt, req_resv_fld, ",
        "create_at, update_at)",
        "values (#{id,jdbcType=BIGINT}, #{version,jdbcType=VARCHAR}, ",
        "#{tradeType,jdbcType=VARCHAR}, #{instCode,jdbcType=VARCHAR}, ",
        "#{requestSn,jdbcType=VARCHAR}, #{timeStamp,jdbcType=VARCHAR}, ",
        "#{encryptData,jdbcType=VARCHAR}, #{signature,jdbcType=VARCHAR}, ",
        "#{origOrderId,jdbcType=VARCHAR}, #{origRequestSn,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=VARCHAR}, #{amt,jdbcType=VARCHAR}, #{reqResvFld,jdbcType=VARCHAR}, ",
        "#{createAt,jdbcType=BIGINT}, #{updateAt,jdbcType=BIGINT})"
    })
    int insert(RefundResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table refund_result
     *
     * @mbg.generated
     */
    @InsertProvider(type=RefundResultSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insertSelective(RefundResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table refund_result
     *
     * @mbg.generated
     */
    @SelectProvider(type=RefundResultSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="version", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="trade_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="inst_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="request_sn", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="time_stamp", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="encrypt_data", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="signature", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="orig_order_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="orig_request_sn", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="amt", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="req_resv_fld", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_at", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="update_at", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<RefundResult> selectByExample(RefundResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table refund_result
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, version, trade_type, inst_code, request_sn, time_stamp, encrypt_data, signature, ",
        "orig_order_id, orig_request_sn, status, amt, req_resv_fld, create_at, update_at",
        "from refund_result",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="version", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="trade_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="inst_code", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="request_sn", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="time_stamp", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="encrypt_data", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="signature", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="orig_order_id", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="orig_request_sn", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="status", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="amt", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="req_resv_fld", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="create_at", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="update_at", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    RefundResult selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table refund_result
     *
     * @mbg.generated
     */
    @UpdateProvider(type=RefundResultSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") RefundResult record, @Param("example") RefundResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table refund_result
     *
     * @mbg.generated
     */
    @UpdateProvider(type=RefundResultSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") RefundResult record, @Param("example") RefundResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table refund_result
     *
     * @mbg.generated
     */
    @UpdateProvider(type=RefundResultSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(RefundResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table refund_result
     *
     * @mbg.generated
     */
    @Update({
        "update refund_result",
        "set version = #{version,jdbcType=VARCHAR},",
          "trade_type = #{tradeType,jdbcType=VARCHAR},",
          "inst_code = #{instCode,jdbcType=VARCHAR},",
          "request_sn = #{requestSn,jdbcType=VARCHAR},",
          "time_stamp = #{timeStamp,jdbcType=VARCHAR},",
          "encrypt_data = #{encryptData,jdbcType=VARCHAR},",
          "signature = #{signature,jdbcType=VARCHAR},",
          "orig_order_id = #{origOrderId,jdbcType=VARCHAR},",
          "orig_request_sn = #{origRequestSn,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR},",
          "amt = #{amt,jdbcType=VARCHAR},",
          "req_resv_fld = #{reqResvFld,jdbcType=VARCHAR},",
          "create_at = #{createAt,jdbcType=BIGINT},",
          "update_at = #{updateAt,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(RefundResult record);

    @Select("select * from refund_result where orig_order_id = #{0} limit 1")
    RefundResult getObjectByOrigOrderId(String origOrderId);

    @Select("select * from refund_result where orig_request_sn = #{0} limit 1")
    RefundResult getObjectByOrigRequestSn(String origRequestSn);

    @Select("select * from refund_result where orig_request_sn = #{0} and orig_order_id = #{1} limit 1")
    RefundResult getObjectByOrigRequestSnId(String origRequestSn, String origOrderId);

    @Select("select id from refund_result where request_sn = #{0} limit 1")
    Long getObjectByRequestSn(String requestSn);
}