JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	IntArrayWorker.java \
	IntArrayWorkerTester.java \
	Pixel.java \
	Picture.java \
	SimplePicture.java \
	DigitalPicture.java \
	PictureFrame.java \
	PictureExplorer.java \
	ImageDisplay.java \
	ColorChooser.java \
	FileChooser.java \
	PictureTester.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
