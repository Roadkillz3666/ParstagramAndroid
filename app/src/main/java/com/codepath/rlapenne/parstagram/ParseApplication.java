package com.codepath.rlapenne.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("mZXgaouiCUSMu5jiHsbEWnBYswonKAzNMa3EoC2e")
                .clientKey("bJ5a91OZqyTUpF4Aasp9qj72NOiVcgBYirf3aSFe")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
