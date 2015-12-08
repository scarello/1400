package encryptwav;

/**
 *
 * @author matt
 */
public class EncryptWav
{
    public static void main(String[] args)
    {
        readAndRewriteWav(args[0]);
    }    

    private static void readAndRewriteWav(String filePathToReadFromMinusExtension)
    {
        String fileExtension = ".wav";

        String filePathToReadFrom =
            filePathToReadFromMinusExtension
            + fileExtension;

        WavFile wavFileToTest = WavFile.readFromFilePath(filePathToReadFrom);

        String filePathToWriteTo =
            filePathToReadFromMinusExtension
            + "-ReadThenWritten"
            + fileExtension;

        wavFileToTest.filePath = filePathToWriteTo;

        wavFileToTest.writeToFilePath();
    }    
}
