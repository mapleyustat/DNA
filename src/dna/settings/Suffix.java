package dna.settings;

/**
 * Suffixes for various files written as output / result data.
 * 
 * @author benni
 * 
 */
public class Suffix {
	// graph as written by GraphWriter and read by GraphReader
	public static final String graph = ".graph";

	// diff as written by DiffWriter and read by DiffReader
	public static final String diff = ".diff";

	// distribution as generated by a metric
	public static final String distribution = ".distribution";

	// gnuplot script generated by the plotting wrapper
	public static final String gnuplot = ".gnuplot";

	// data files used by gnuplot
	public static final String data = ".data";

	// list of values (ValueList)
	public static final String values = ".values";

	// list of runtimes (RunTimeList)
	public static final String runtimes = ".runtimes";
}
