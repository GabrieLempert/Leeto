package com.example.foodfun_v2.model.database;

import android.provider.BaseColumns;

public final class TripContract {

    private TripContract() {
    }

    public static class TripEntry implements BaseColumns {
        public static final String TABLE_NAME = "trips";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_START_DATE = "start_date";
        public static final String COLUMN_END_DATE = "end_date";
    }

    public static class MealEntry implements BaseColumns {
        public static final String TABLE_NAME = "meals";
        public static final String COLUMN_TRIP_ID = "trip_id";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_DATE = "date";
    }

    public static class IngredientEntry implements BaseColumns {
        public static final String TABLE_NAME = "ingredients";
        public static final String COLUMN_MEAL_ID = "meal_id";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_QUANTITY = "quantity";
    }

    public static class SupplyEntry implements BaseColumns {
        public static final String TABLE_NAME = "supplies";
        public static final String COLUMN_TRIP_ID = "trip_id";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_QUANTITY = "quantity";
    }

    // Add more table entries as needed
}

