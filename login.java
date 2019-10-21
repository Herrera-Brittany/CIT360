    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;
package net.codejava.networking;
 

import java.net.HttpURLConnection;
import java.net.URL;
import byui.cit260.oregontrail.view.StartProgramView;
import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Player;
import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.PrintWriter;
*/package net.codejava.networking;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
 
/**
 * A utility that downloads a file from a URL.
 * @author www.codejava.net
 *
 */
public class HttpDownloadUtility {
    private static final int BUFFER_SIZE = 4096;
 
    /**
     * Downloads a file from a URL
     * @param fileURL HTTP URL of the file to be downloaded
     * @param saveDir path of the directory to save the file
     * @throws IOException
     */
    public static void downloadFile(String fileURL, String saveDir)
            throws IOException {
        URL url = new URL(fileURL);
        //----this is where we could add a file like rules or something
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        int responseCode = httpConn.getResponseCode();
 
        // always check HTTP response code first
        if (responseCode == HttpURLConnection.HTTP_OK) {
            String fileName = "";
            String disposition = httpConn.getHeaderField("Content-Disposition");
            String contentType = httpConn.getContentType();
            int contentLength = httpConn.getContentLength();
 
            if (disposition != null) {
                // extracts file name from header field
                int index = disposition.indexOf("filename=");
                if (index > 0) {
                    fileName = disposition.substring(index + 10,
                            disposition.length() - 1);
                }
            } else {
                // extracts file name from URL
                fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1,
                        fileURL.length());
            }
 
            System.out.println("Content-Type = " + contentType);
            System.out.println("Content-Disposition = " + disposition);
            System.out.println("Content-Length = " + contentLength);
            System.out.println("fileName = " + fileName);
 
            // opens input stream from the HTTP connection
            InputStream inputStream = httpConn.getInputStream();
            String saveFilePath = saveDir + File.separator + fileName;
             
            // opens an output stream to save into file
            FileOutputStream outputStream = new FileOutputStream(saveFilePath);
 
            int bytesRead = -1;
            byte[] buffer = new byte[BUFFER_SIZE];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
 
            outputStream.close();
            inputStream.close();
 
            System.out.println("File downloaded");
        } else {
            System.out.println("No file to download. Server replied HTTP code: " + responseCode);
        }
        httpConn.disconnect();
    }
}
*/
/**
 *
 * @author ralphb//cit260 team casey baldwin brittany herrera
 */
public class OregonTrail {

     private static Game currentGame = null;
     private static Player player = null;

     private static PrintWriter outFile = null;
     private static BufferedReader inFile = null;
     
     private static PrintWriter logFile = null;

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) throws Exception {

          try {
               OregonTrail.inFile = new BufferedReader(new InputStreamReader(System.in));
               OregonTrail.outFile = new PrintWriter(System.out, true);

               //log file
               String filePath = "log.txt";
               OregonTrail.logFile = new PrintWriter(filePath);
               
               StartProgramView startProgramView = new StartProgramView();
               startProgramView.display();
          } catch (Throwable te) {
               System.out.println("Exception: " + te.toString()
                       + "\nCause: " + te.getCause()
                       + "\nMessage: " + te.getMessage());
               
//             startProgramView.display();
          }
          
         
          finally {
               try {
                   if (OregonTrail.inFile != null)
                        OregonTrail.inFile.close();

                   if (OregonTrail.outFile != null)
                        OregonTrail.outFile.close();
                   
                   if (OregonTrail.logFile != null)
                        OregonTrail.logFile.close();
                   
              } catch (IOException ex) {
              System.out.println("Error closing files");
              return;
               }
          }
     }

     
        public static PrintWriter getLogFile() {
            return logFile;
        }
        
        public static void setLogFile(PrintWriter logFile) {
            OregonTrail.logFile = logFile;
        }
        
     public static Player getPlayer() {
          return player;
     }

     public static void setPlayer(Player player) {
          OregonTrail.currentGame = currentGame;
     }

     public static Game getCurrentGame() {
          Game currentGame = OregonTrail.currentGame;
          return currentGame;
     }

     public static void setCurrentGame(Game currentGame) {
          OregonTrail.currentGame = currentGame;
     }

     public static BufferedReader getInFile() {
          return inFile;
     }

     public static void setInFile(BufferedReader inFile) {
          OregonTrail.inFile = inFile;
     }

     public static PrintWriter getOutFile() {
          return outFile;
     }

     public static void setOutFile(PrintWriter outFile) {
          OregonTrail.outFile = outFile;
     }

}