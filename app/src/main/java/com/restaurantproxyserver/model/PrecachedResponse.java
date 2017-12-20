package com.restaurantproxyserver.model;



public class PrecachedResponse {
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public static PrecachedResponse getOurInstance() {
        return ourInstance;
    }

    private String contents;
    private static final PrecachedResponse ourInstance = new PrecachedResponse();

    public static PrecachedResponse getInstance() {
        return ourInstance;
    }



    private PrecachedResponse() {
    }
}
