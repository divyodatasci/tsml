package timeseriesweka.classifiers;

public interface Seedable {
    String TRAIN_SEED_KEY = "trainSeed";
    String TEST_SEED_KEY = "testSeed";
    void setTrainSeed(long seed);
    void setTestSeed(long seed);
    Long getTrainSeed();
    Long getTestSeed();
}
