package com.swapi.utils;

import android.text.TextUtils;
import com.swapi.swModels.SWPeople;
import com.swapi.swModels.SWVehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Utility class for All API
 */
public class SWUtils {

    public enum SORT {
        ASC,
        DESC
    }

    public static int compare(int lhs, int rhs) {
        return lhs < rhs ? -1 : (lhs == rhs ? 0 : 1);
    }

    public static ArrayList<SWPeople> sortPeopleByMass(ArrayList<SWPeople> SWPeopleList, final SORT sortBy) {
        if (SWPeopleList == null) {
            return null;
        }
        Collections.sort(SWPeopleList, new Comparator<SWPeople>() {
            @Override
            public int compare(SWPeople lhs, SWPeople rhs) {
                int heightLhs = Integer.parseInt(lhs.mass);
                int heightRhs = Integer.parseInt(rhs.mass);
                if (sortBy == SORT.ASC) {
                    return SWUtils.compare(heightLhs, heightRhs);
                } else {
                    return SWUtils.compare(heightRhs, heightLhs);
                }
            }
        });
        return SWPeopleList;
    }

    public static ArrayList<SWPeople> sortPeopleByHeight(ArrayList<SWPeople> SWPeopleList, final SORT sortBy) {
        if (SWPeopleList == null) {
            return null;
        }
        Collections.sort(SWPeopleList, new Comparator<SWPeople>() {
            @Override
            public int compare(SWPeople lhs, SWPeople rhs) {
                int heightLhs = Integer.parseInt(lhs.height);
                int heightRhs = Integer.parseInt(rhs.height);
                if (sortBy == SORT.ASC) {
                    return SWUtils.compare(heightLhs, heightRhs);
                } else {
                    return SWUtils.compare(heightRhs, heightLhs);
                }
            }
        });
        return SWPeopleList;
    }

    public static boolean isEmpireVehicle(SWVehicle SWVehicle) {
        if (SWVehicle == null || TextUtils.isEmpty(SWVehicle.manufacturer)) {
            return false;
        }
        return (SWVehicle.manufacturer.contains("Sienar")
                    || SWVehicle.manufacturer.contains("Kuat")
                    || SWVehicle.manufacturer.contains("Imperial")
                    || SWVehicle.manufacturer.contains("Aratech"));
    }

    public static String filmUrlToFilmTitle(String filmUrl) {
        int filmId;
        try {
            filmId = filmUrl.charAt(filmUrl.length()-2);
        } catch (Exception e) {
            return null;
        }
        switch (filmId) {
            case 1:
                return "Star Wars Episode IV A New Hope";
            case 2:
                return "Star Wars Episode V The Empire Strikes Back";
            case 3:
                return "Star Wars Episode VI Return of the Jedi";
            case 4:
                return "Star Wars Episode I The Phantom Menace";
            case 5:
                return "Star Wars Episode II Attack of the Clones";
            case 6:
                return "Star Wars Episode III Revenge of the Sith";
            default:
                return null;
        }
    }
}
