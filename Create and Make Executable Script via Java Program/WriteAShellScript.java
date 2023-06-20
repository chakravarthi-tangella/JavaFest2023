import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class WriteAShellScript
{
	public static void main(String[] args) throws IOException
	{
		var script = """
				#!/bin/bash
				echo "hello, world - via Java Program"
			     """;

		var path = Files.writeString(Path.of("hello.sh"), script);

		System.out.println("File [hello.sh] has been written");
	}
}

