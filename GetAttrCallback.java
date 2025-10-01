import jnr.ffi.*;
import jnr.ffi.annotations.Delegate;

public interface GetAttrCallback {
    @Delegate
    int getattr(String path, Pointer stbuf);
}