package org.stockwatcher.data.cassandra;

import java.util.Date;
import java.util.Optional;

import com.datastax.driver.core.LocalDate;

public class DateHelper {

	static Date toDate(LocalDate date) {
		return Optional.ofNullable(date).map(d->new Date(d.getMillisSinceEpoch())).get();
	}

}
