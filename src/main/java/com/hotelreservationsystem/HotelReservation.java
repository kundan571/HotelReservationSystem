package com.hotelreservationsystem;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class HotelReservation {

    static ArrayList<HotelDetails> hotelDetails = new ArrayList<>();
    public static HotelReservation hotelReservation = new HotelReservation();
    public static Scanner scanner = new Scanner(System.in);

    void addHotelDetails() {
        System.out.println("Enter how many hotel you want to add:");
        int noOfHotel = scanner.nextInt();
        for (int i = 0; i < noOfHotel; i++) {
            System.out.println("Enter Hotel name");
            String name = scanner.next();
            System.out.println("Enter the hotel rate");
            int rate = scanner.nextInt();
            HotelDetails hotel1 = new HotelDetails(name, rate);
            hotelDetails.add(hotel1);
            System.out.println(hotelDetails.toString());
        }
    }

    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("ddMMMyyyy");

    void cheapestHotel(String startDate, String endDate) {
        addHotelDetails();
        LocalDate startDate1 = LocalDate.parse(startDate, DATE_FORMAT);
        LocalDate endDate1 = LocalDate.parse(endDate, DATE_FORMAT);
        long days = ChronoUnit.DAYS.between(startDate1, endDate1);

        List<HotelDetails> rates = hotelDetails.stream().map(hotelData -> {
            HotelDetails result = new HotelDetails();
            result.setName(hotelData.getName());
            result.setRate(hotelData.getRate());
            result.setTotalRate((int) (hotelData.getRate() * days));
            return result;
        }).sorted(Comparator.comparing(HotelDetails::getTotalRate)).collect(Collectors.toList());

        System.out.println("The total days are : " + days);
        rates.forEach(System.out::println);
    }

    void addWeekDayAndWeekendRates() {
        System.out.println("Enter how many hotel you want to add:");
        int noOfHotel = scanner.nextInt();
        for (int i = 0; i < noOfHotel; i++) {
            System.out.println("Enter Hotel name");
            String name = scanner.next();
            System.out.println("Enter the week Day rate");
            int weekDay = scanner.nextInt();
            System.out.println("Enter the weekend rate");
            int weekend = scanner.nextInt();
            System.out.println("Enter ratings of hotel");
            int ratings = scanner.nextInt();
            HotelDetails hotel1 = new HotelDetails(name, weekend, weekDay, ratings);
            hotelDetails.add(hotel1);
            System.out.println(hotelDetails.toString());
        }
    }

    void cheapestHotelWeekdayWeekend(String startDate, String endDate) {
        addWeekDayAndWeekendRates();
        LocalDate startDate2 = LocalDate.parse(startDate, DATE_FORMAT);
        LocalDate endDate2 = LocalDate.parse(endDate, DATE_FORMAT);
        long days = ChronoUnit.DAYS.between(startDate2, endDate2);

        List<HotelDetails> rates = hotelDetails.stream().map(hotelData -> {
            HotelDetails result = new HotelDetails();
            result.setName(hotelData.getName());
            if (startDate2.getDayOfWeek().equals(DayOfWeek.SATURDAY)
                    || endDate2.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                result.setTotalRate((int) (hotelData.getWeekendRate() * days));
                result.setTotalRate((int) (hotelData.getWeekdayRate() + hotelData.getWeekendRate() * days));
            } else {
                result.setTotalRate((int) (hotelData.getWeekdayRate() + hotelData.getWeekendRate() * days));
            }
            result.setWeekdayRate(hotelData.getWeekdayRate());
            result.setWeekendRate(hotelData.getWeekendRate());
            return result;
        }).sorted(Comparator.comparing(HotelDetails::getTotalRate)).collect(Collectors.toList());

        System.out.println("The total days are : " + days);
        rates.forEach(System.out::println);
    }


    public static void main(String[] args) {
        hotelReservation.cheapestHotelWeekdayWeekend("11Sept2020","12Sept2020");

    }
}

