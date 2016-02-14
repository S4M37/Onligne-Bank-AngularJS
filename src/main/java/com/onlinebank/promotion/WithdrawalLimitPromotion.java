package com.onlinebank.promotion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;

/**
 * Created by p0wontnx on 2/14/16.
 */
@Entity(name = "WithdrawalLimitPromotion")
@PrimaryKeyJoinColumn(name = "withdrawallimitpromotionId", referencedColumnName = "promotionId")
public class WithdrawalLimitPromotion extends Promotion {

    @Column(insertable = false, updatable = false)
    private Long withdrawallimitpromotionId;

    @NotNull
    private Double limitPp;

    @NotNull
    private Integer period;

    public Double getLimitPp() {
        return limitPp;
    }

    public WithdrawalLimitPromotion setLimitPp(Double limitPp) {
        this.limitPp = limitPp;
        return this;
    }

    public Long getWithdrawallimitpromotionId() {
        return withdrawallimitpromotionId;
    }

    public WithdrawalLimitPromotion setWithdrawallimitpromotionId(Long withdrawallimitpromotionId) {
        this.withdrawallimitpromotionId = withdrawallimitpromotionId;
        return this;
    }

    public Integer getPeriod() {
        return period;
    }

    public WithdrawalLimitPromotion setPeriod(Integer period) {
        this.period = period;
        return this;
    }

}
