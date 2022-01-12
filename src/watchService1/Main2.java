package watchService1;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

import com.sun.nio.file.ExtendedWatchEventModifier;

public class Main2 {

    public static void main(String[] args) throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault().newWatchService();

      Path path = Paths.get(System.getProperty("user.home") + "/temp");

      path.register(watchService,
              new WatchEvent.Kind[] {
                  StandardWatchEventKinds.ENTRY_CREATE,
                  StandardWatchEventKinds.ENTRY_DELETE,
                  StandardWatchEventKinds.ENTRY_MODIFY },
              ExtendedWatchEventModifier.FILE_TREE );

      WatchKey key;
      while ((key = watchService.take()) != null) {
          for (WatchEvent<?> event : key.pollEvents())
              System.out.printf("Event kind: %s, File affected: %s\n", event.kind(), event.context());
          key.reset();
      }
    }
}
