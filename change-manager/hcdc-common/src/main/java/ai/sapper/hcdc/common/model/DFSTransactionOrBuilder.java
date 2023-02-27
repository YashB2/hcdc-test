// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_block.proto

package ai.sapper.hcdc.common.model;

public interface DFSTransactionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ai_sapper_hcdc_common_model.DFSTransaction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required int64 transactionId = 1;</code>
   * @return Whether the transactionId field is set.
   */
  boolean hasTransactionId();
  /**
   * <code>required int64 transactionId = 1;</code>
   * @return The transactionId.
   */
  long getTransactionId();

  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSTransaction.Operation op = 2;</code>
   * @return Whether the op field is set.
   */
  boolean hasOp();
  /**
   * <code>required .ai_sapper_hcdc_common_model.DFSTransaction.Operation op = 2;</code>
   * @return The op.
   */
  ai.sapper.hcdc.common.model.DFSTransaction.Operation getOp();

  /**
   * <code>required uint64 timestamp = 3;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>required uint64 timestamp = 3;</code>
   * @return The timestamp.
   */
  long getTimestamp();
}
