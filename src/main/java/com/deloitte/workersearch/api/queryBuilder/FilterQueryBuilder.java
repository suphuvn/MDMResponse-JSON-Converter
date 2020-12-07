package com.deloitte.workersearch.api.queryBuilder;

import org.apache.commons.lang3.StringUtils;

/**
 * This class acts as super class for rest of query builder classes; contains common methods used throughout query builders
 */
public class FilterQueryBuilder {

    /**
     * Build fuzzy query string by appending additional parameters to StringBuilder, where each param is joined by OR operator
     *
     * @param queryParam query parameter key string
     * @param queryValue query parameter value string
     * @param fqBuilder string builder to construct query
     */
    public void appendToFuzzyQuery(String queryParam, String queryValue, StringBuilder fqBuilder) {
        if(StringUtils.isNotEmpty(queryValue)) {
            if(fqBuilder.length() > 0) {
                fqBuilder.append(" OR ");
            }
            fqBuilder.append(queryParam + "'" + queryValue + "'");
        }
    }

    /**
     * Build exact query string by appending additional parameters to StringBuilder, where each param is joined by AND operator
     *
     * @param queryParam query parameter key string
     * @param queryValue query parameter value string
     * @param fqBuilder string builder to construct query
     */
    public void appendToExactQuery(String queryParam, String queryValue, StringBuilder fqBuilder) {
        if(StringUtils.isNotEmpty(queryValue)) {
            if(fqBuilder.length() > 0) {
                fqBuilder.append(" AND ");
            }
            fqBuilder.append(queryParam + "'" + queryValue + "'");
        }
    }
}