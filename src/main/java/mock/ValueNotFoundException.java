package mock;

class ValueNotFoundException extends RuntimeException {
    ValueNotFoundException(Long id) {
        super("Could not find value " + id);
    }
}
