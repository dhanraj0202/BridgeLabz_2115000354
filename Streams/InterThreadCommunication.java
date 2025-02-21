import java.io.*;

class WriterThread extends Thread{
	private PipedOutputStream pos;

	public WriterThread(PipedOutputStream pos){
		this.pos = pos;
	}

	@Override
	public void run(){
		try{
			String message = "Hello from Writer Thread!";
			System.out.println("Writer: Writing data...");
			pos.write(message.getBytes());
			pos.close();
		}catch(IOException e){
			System.out.println("Writer Error: " + e.getMessage());
		}
	}
}

class ReaderThread extends Thread{
	private PipedInputStream pis;

	public ReaderThread(PipedInputStream pis){
		this.pis = pis;
	}

	@Override
	public void run(){
		try{
			byte[] buffer = new byte[1024];
			int bytesRead = pis.read(buffer);
			System.out.println("Reader: Received - " + new String(buffer, 0, bytesRead));
			pis.close();
		}catch(IOException e){
			System.out.println("Reader Error: " + e.getMessage());
		}
	}
}

public class InterThreadCommunication{
	public static void main(String[] args){
		try{
			PipedOutputStream pos = new PipedOutputStream();
			PipedInputStream pis = new PipedInputStream(pos);

			WriterThread writer = new WriterThread(pos);
			ReaderThread reader = new ReaderThread(pis);

			writer.start();
			reader.start();

			writer.join();
			reader.join();

		}catch(IOException | InterruptedException e){
			System.out.println("Main Thread Error: " + e.getMessage());
		}
	}
}