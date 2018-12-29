package quantlib;

import java.time.Year;

public class Date
{
   bool isLeap(long year) { return Year.of(year).isLeap() }
}