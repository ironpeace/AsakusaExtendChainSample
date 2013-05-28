package com.asakusafw.runtime.stage;
/**
 * A cleanup stage client.
 */
public final class CleanupStageClient extends AbstractCleanupStageClient {
    @Override protected String getBatchId() {
        return "ecsBatch";
    }
    @Override protected String getFlowId() {
        return "TheExtendChainSampleJobFlow";
    }
    @Override protected String getStageId() {
        return "cleanup";
    }
    @Override protected String getCleanupPath() {
        return "target/hadoopwork/${execution_id}";
    }
}