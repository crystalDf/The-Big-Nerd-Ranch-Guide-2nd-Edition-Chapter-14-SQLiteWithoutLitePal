package com.star.sqlitewithoutlitepal.databases;


public class MySQLiteDbSchema {

    public static final class NewsTable {

        public static final String TABLE_NAME = "news";

        public static final class Cols {
            private static final String ID = "_id";
            public static final String TITLE = "title";
            public static final String CONTENT = "content";
            public static final String PUBLISHED_DATE = "published_date";
            public static final String COMMENT_COUNT = "comment_count";
        }

        public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + Cols.ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Cols.TITLE + " TEXT, "
                + Cols.CONTENT + " TEXT, "
                + Cols.PUBLISHED_DATE + " INTEGER, "
                + Cols.COMMENT_COUNT + " INTEGER"
                + ")";
    }

    public static final class CommentTable {

        public static final String TABLE_NAME = "comment";

        public static final class Cols {
            private static final String ID = "_id";
            public static final String CONTENT = "content";
            public static final String PUBLISHED_DATE = "published_date";
        }

        public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + Cols.ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Cols.CONTENT + " TEXT"
                + ")";

        public static final String ALTER_TABLE = "ALTER TABLE " + TABLE_NAME + " ADD COLUMN "
                + Cols.PUBLISHED_DATE + " INTEGER";

    }
}
