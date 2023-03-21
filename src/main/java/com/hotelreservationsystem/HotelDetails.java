package com.hotelreservationsystem;

import java.util.Optional;

public class HotelDetails {

    int rate;
    String name;
    String hotelName;
    int totalRate;
    int weekendRate;
    int weekdayRate;
    int ratings;
    int regularWeekdayPrices;
    int regularWeekendPrices;
    int rewardWeekdayPrices;
    int rewardWeekendPrices;
    String customerType;

    public HotelDetails(String name, int weekendRate, int weekdayRate, int ratings) {
        super();
//        this.name = name;
        this.weekendRate = weekendRate;
        this.weekdayRate = weekdayRate;
        this.ratings = ratings;
    }

    public HotelDetails(String name, int ratings, int regularWeekdayPrices, int regularWeekendPrices, int rewardWeekdayPrices, int rewardWeekendPrices) {
        super();
        //       this.name = name;
        this.ratings = ratings;
        this.regularWeekdayPrices = regularWeekdayPrices;
        this.regularWeekendPrices = regularWeekendPrices;
        this.rewardWeekdayPrices = rewardWeekdayPrices;
        this.rewardWeekendPrices = rewardWeekendPrices;
        this.customerType = customerType;
    }

    public HotelDetails(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public HotelDetails() {
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(int totalRate) {
        this.totalRate = totalRate;
    }

    public int getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(int weekendRate) {
        this.weekendRate = weekendRate;
    }

    public int getWeekdayRate() {
        return weekdayRate;
    }

    public void setWeekdayRate(int weekdayRate) {
        this.weekdayRate = weekdayRate;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getRegularWeekdayPrices() {
        return regularWeekdayPrices;
    }

    public void setRegularWeekdayPrices(int regularWeekdayPrices) {
        this.regularWeekdayPrices = regularWeekdayPrices;
    }

    public int getRegularWeekendPrices() {
        return regularWeekendPrices;
    }

    public void setRegularWeekendPrices(int regularWeekendPrices) {
        this.regularWeekendPrices = regularWeekendPrices;
    }

    public int getRewardWeekdayPrices() {
        return rewardWeekdayPrices;
    }

    public void setRewardWeekdayPrices(int rewardWeekdayPrices) {
        this.rewardWeekdayPrices = rewardWeekdayPrices;
    }

    public int getRewardWeekendPrices() {
        return rewardWeekendPrices;
    }

    public void setRewardWeekendPrices(int rewardWeekendPrices) {
        this.rewardWeekendPrices = rewardWeekendPrices;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "HotelDetails[" + "name= " + getName() + ", rate= " + getRate() + ", totalRate = " + getTotalRate() + "]";
    }
}


