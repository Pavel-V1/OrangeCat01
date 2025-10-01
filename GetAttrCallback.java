import jnr.ffi.*;

public interface GetAttrCallback {
    @Delegate
    int getattr(String path, Pointer stbuf);
}