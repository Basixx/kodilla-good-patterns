package com.kodilla.good.patterns.challenges.four;

public class Airport {
    private String City;
    private String Country;

    public Airport(String city, String country) {
        City = city;
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public String getCountry() {
        return Country;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "City='" + City + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;

        Airport airport = (Airport) o;

        if (City != null ? !City.equals(airport.City) : airport.City != null) return false;
        return Country != null ? Country.equals(airport.Country) : airport.Country == null;
    }

    @Override
    public int hashCode() {
        int result = City != null ? City.hashCode() : 0;
        result = 31 * result + (Country != null ? Country.hashCode() : 0);
        return result;
    }
}
