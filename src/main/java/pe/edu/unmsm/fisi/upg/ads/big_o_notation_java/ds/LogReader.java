package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java.ds;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class LogReader implements Iterable<LogLine> {
    private final int sizeLogLines;
    private final int sizeUniqueIps;
    private Collection<String> uniqueIps;

    public LogReader(int sizeLogLines, int sizeUniqueIps) {
        this.sizeLogLines = sizeLogLines;
        this.sizeUniqueIps = sizeUniqueIps;
        this.uniqueIps = new HashSet<String>();
    }

    public Iterator<LogLine> iterator() {
        return new LogReaderIterator(this.sizeLogLines, this.sizeUniqueIps);
    }

    @SuppressWarnings("unused")
    public int readAllLogs() {
        int sizeLogLines = 0;
        for (LogLine line : this) {
            String ip = line.getIP();
            sizeLogLines++;
        }
        return sizeLogLines;
    }

    public int getSizeUniqueIps() {
    	
    	//Complejidad N * N

        for (LogLine logLine : this) {
            String ip = logLine.getIP();
            this.uniqueIps.add(ip);
        }
        return this.uniqueIps.size();
    }
}
