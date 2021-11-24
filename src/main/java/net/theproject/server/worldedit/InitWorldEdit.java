package net.theproject.server.worldedit;


import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.WorldEdit;
import com.sk89q.worldedit.WorldEditException;
import com.sk89q.worldedit.extent.clipboard.Clipboard;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardFormat;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardFormats;
import com.sk89q.worldedit.extent.clipboard.io.ClipboardReader;
import com.sk89q.worldedit.function.operation.Operation;
import com.sk89q.worldedit.function.operation.Operations;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.session.ClipboardHolder;
import com.sk89q.worldedit.world.World;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InitWorldEdit {

    public class position{
        int x;
        int y;
        int z;
    }

    protected Clipboard clipboard;

    public void copy(File file) throws FileNotFoundException {

        ClipboardFormat format = ClipboardFormats.findByFile(file);
        try (
                ClipboardReader reader = format.getReader(new FileInputStream(file))) {
            this.clipboard = reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void past(World world, int x, int y, int z) throws WorldEditException {
        try (EditSession editSession = WorldEdit.getInstance().newEditSession((world))) {

            Operation operation = new ClipboardHolder(this.clipboard)
                    .createPaste(editSession)
                    .to(BlockVector3.at(x, y, z))
                    // configure here
                    .build();
            Operations.complete(operation);
        }
    }

}
