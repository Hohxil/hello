package com.edu.hello.mapper;

import com.edu.hello.entity.CouponGoods;
import com.edu.hello.entity.CouponGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_goods
     *
     * @mbg.generated
     */
    long countByExample(CouponGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_goods
     *
     * @mbg.generated
     */
    int deleteByExample(CouponGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_goods
     *
     * @mbg.generated
     */
    int insert(CouponGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_goods
     *
     * @mbg.generated
     */
    int insertSelective(CouponGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_goods
     *
     * @mbg.generated
     */
    List<CouponGoods> selectByExample(CouponGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_goods
     *
     * @mbg.generated
     */
    CouponGoods selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CouponGoods record, @Param("example") CouponGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CouponGoods record, @Param("example") CouponGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CouponGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CouponGoods record);
}