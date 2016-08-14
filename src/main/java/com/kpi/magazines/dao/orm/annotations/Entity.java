package com.kpi.magazines.dao.orm.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Konstantin Minkov on 23.06.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {

    String table();
}