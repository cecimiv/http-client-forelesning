package no.kristiania.http;

import java.util.HashMap;
import java.util.Map;

public class QueryString {
    private Map<String, String> parameters = new HashMap<>();


    public QueryString(String queryString) {
        for(String parameter : queryString.split("&")){
            int equalPos = parameter.indexOf('=');
            String parameterName = parameter.substring(0, equalPos);
            String parameterValue = parameter.substring(equalPos+1);
            parameters.put(parameterName, parameterValue);

        }
    }

    public String getParameter(String status) {

        return parameters.get(parameterName);
    }
    }

