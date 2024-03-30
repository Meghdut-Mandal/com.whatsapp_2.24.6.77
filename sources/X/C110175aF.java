package X;

import com.whatsapp.R;

/* renamed from: X.5aF  reason: invalid class name and case insensitive filesystem */
public abstract class C110175aF {
    public static int A00(String str) {
        Integer num;
        Integer[] A00 = C023109s.A00(31);
        int length = A00.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = C023109s.A0H;
                break;
            }
            num = A00[i];
            if (C129406Gu.A00(num).equals(str)) {
                break;
            }
            i++;
        }
        switch (num.intValue()) {
            case 0:
                return R.drawable.ic_business_cat_apparel_and_clothing;
            case 1:
                return R.drawable.ic_business_cat_shopping_and_retail;
            case 2:
                return R.drawable.ic_business_cat_automotive_service;
            case 3:
                return R.drawable.ic_business_cat_restaurant;
            case 4:
                return R.drawable.ic_business_cat_grocery_store;
            case 5:
                return R.drawable.ic_business_cat_pizza_place;
            case 6:
                return R.drawable.ic_business_cat_food_and_beverage;
            case 7:
                return R.drawable.ic_business_cat_education;
            case 8:
                return R.drawable.ic_business_cat_sports_and_fitness;
            case 9:
                return R.drawable.ic_business_cat_local_services;
            case 10:
                return R.drawable.ic_business_cat_advertising_and_marketing;
            case 11:
                return R.drawable.ic_business_cat_agriculture;
            case 12:
                return R.drawable.ic_business_cat_arts_and_entertainment;
            case 13:
                return R.drawable.ic_business_cat_beauty_cosmetic_and_personal_care;
            case 14:
                return R.drawable.ic_business_cat_commercial_and_industrial;
            case 15:
                return R.drawable.ic_business_cat_communities_and_organizations;
            case 16:
                return R.drawable.ic_business_cat_finance;
            case 17:
                return R.drawable.ic_business_cat_hotel_and_lodging;
            case 18:
                return R.drawable.ic_business_cat_interests;
            case 19:
                return R.drawable.ic_business_cat_legal;
            case 20:
                return R.drawable.ic_business_cat_media;
            case 21:
                return R.drawable.ic_business_cat_media_and_news_company;
            case 22:
                return R.drawable.ic_business_cat_medical_and_health;
            case 23:
                return R.drawable.ic_business_cat_non_governmental_org;
            case 24:
                return R.drawable.ic_business_cat_non_profit_org;
            case 25:
                return R.drawable.ic_business_cat_public_and_gov_service;
            case 26:
                return R.drawable.ic_business_cat_real_estate;
            case 27:
                return R.drawable.ic_business_cat_science_tech_and_eng;
            case 28:
                return R.drawable.ic_business_cat_travel_and_transportation;
            case 29:
                return R.drawable.ic_business_cat_vehicle_aircraft_boat;
            default:
                return R.drawable.ic_business_cat;
        }
    }
}
