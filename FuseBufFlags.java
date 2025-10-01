import jnr.ffi.*;

public enum FuseBufFlags implements EnumMapper.IntegerEnum {
    FUSE_BUF_IS_FD(1 << 1),
    FUSE_BUF_FD_SEEK(1 << 2),
    FUSE_BUF_FD_RETRY(1 << 3);

    private final int value;

    FuseBufFlags(int value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return value;
    }
}