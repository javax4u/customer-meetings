/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author rupesh kumar
 */
public class States {

    private String name;
    private String abbreviation;
    private String population;
    private String timeZOne;
    private String coast;
    private List<String> cities;
    private String formationYear;
    private String representative;

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        //population=population.replace(",", "");
        this.population = population;
    }
     public Integer getPopulationInt() {
        return Integer.valueOf(population.replace(",", ""));
    }

    public String getTimeZOne() {
        return timeZOne;
    }

    public void setTimeZOne(String timeZOne) {
        this.timeZOne = timeZOne;
    }

    public String getCoast() {
        return coast;
    }

    public void setCoast(String coast) {
        this.coast = coast;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public String getFormationYear() {
        return formationYear;
    }

    public void setFormationYear(String formationYear) {
        this.formationYear = formationYear;
    }

    public int getRepresentativeInt() {
       return Integer.parseInt(getRepresentative());
    }

    @Override
    public String toString() {
        return getName();//To change body of generated methods, choose Tools | Templates.
    }
    
    

}
