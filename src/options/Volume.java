package options;

public enum Volume {
	SILENT    (0),
	WHISPER   (5),
	QUIET     (10),
	AUDIBLE   (20),
	LOUD      (50),
	ROARING   (80),
	DEAFENING (100);
	
	private final int level;
	
	Volume(int level) {
		this.level = level;
	}
}
