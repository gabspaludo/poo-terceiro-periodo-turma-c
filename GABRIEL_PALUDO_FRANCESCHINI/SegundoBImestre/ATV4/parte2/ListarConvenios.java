package SegundoBimestre.ATV4.parte2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ListarConvenios {

    public static String listagemConvenio() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJSNDc0L2N1N0JpV29hNkJhYWJHTm5kdDVDWS9VcWpwY0JJTlZONW1tTmZjZ3NaVTVKalBKL3hkdHNiNjNOZG84YWRhTC83Z3FQYWtqc3ViRTVDaFlDcURnOWtYcEFGK2h2Qnh5L3RBNUJENU1hbm1sMXNIZXM3enVJN1V6cTNTVFNGbjJvYVlHZUZVc2JOWEVzbHljQVRqNEszUDVuSkZrdUI5L1hZNTE3OXlmd0tyWDVrOEpoNW96clpJVnpieWFvN0I1aVRnOWxNUmo1Q2k2TjdRRU5PbjdHY25xVkRtYkdGVWw0MWF1MnBuUDhzeHBOVkl0TU82Q3BFdkdjTVNOK2xCdVpVYzQvNk9iWWJEZWlIN2hSVUg2V1dRc2lXc29EWjZBUEk1UWR4aDdOdXdhbGI1NnI4UHdJekxkTk9ocE9KekZSL3A0Ny8wZFFIS3EyaWU4VXFUdHgza1IvMjRvNmRzWUVYdFpSVUlCWHBFRUZRVGNYU295dmRjaXRtc3pRb05lWEJqaHc4bkMvLzBPK0lKa0FmTWtoNjRrSkxxand5YnV0a3MrWm9RSnFrem43aEJKWGhTOHVCdnFqSi9oYkRqNWJSUUdsTjcyOHZBZ2crRXVCYTY0NUpEN2prS3U4Mmd6dzdJN2NhY1lDanlRUnp3NkQ1NTZxWXNHZUFucWlodTdaNU56a2ZhRVJ3Slg4Mmw0cHgxS0VNUjhSZ2dhaFhLd0JwTkZjQVNOMDdabFBRMkZudFRVbWJlMFhnUkFkOVNIRlZjbXhCREVLQVRXQitqM21BPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZTFlY2MxMGEwMzEwNGM4NGFiZWQiLCJleHAiOjE3MTk1NDQxNTMsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.Oc7d7JP1jU7SgbKEdkj7YcWE0Y2cj8la264BVNzqoOI");
            connection.setDoOutput(true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            return response.toString();

        } catch (Exception e) {
            return e.getMessage();
        }
    }

}