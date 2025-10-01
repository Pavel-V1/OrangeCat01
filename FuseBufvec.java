import jnr.ffi.*;

public class FuseBufvec extends Struct {
    public FuseBufvec(jnr.ffi.Runtime runtime) {
        super(runtime);
    }
    public final size_t count = new size_t();
    public final size_t idx = new size_t();
    public final size_t off = new size_t();
    public final FuseBuf buf = inner(new FuseBuf(getRuntime()));
}