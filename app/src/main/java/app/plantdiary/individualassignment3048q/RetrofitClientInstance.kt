package app.plantdiary.individualassignment3048q

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientInstance {
    // establishes retrofit client instanced for the JSON file
    private var retrofit: Retrofit? = null;
    private val BASE_URL = "https://pkgstore.datahub.io";

    val retrofitInstance : Retrofit?
    get() {
        // if object has not been created
        if (retrofit == null) {
            // build it
            retrofit = retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        }
        return retrofit;
    };
}