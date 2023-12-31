// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: example.proto

package ev24.protobuf.example;

public interface ExampleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ev24.protobuf.example.ExampleResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   **
   * UUID for request tracking
   * </pre>
   *
   * <code>string request_id = 1 [json_name = "request_id"];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   **
   * UUID for request tracking
   * </pre>
   *
   * <code>string request_id = 1 [json_name = "request_id"];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
   */
  int getPayloadCount();
  /**
   * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
   */
  boolean containsPayload(
      java.lang.String key);
  /**
   * Use {@link #getPayloadMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getPayload();
  /**
   * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getPayloadMap();
  /**
   * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
   */

  java.lang.String getPayloadOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; payload = 2 [json_name = "payload"];</code>
   */

  java.lang.String getPayloadOrThrow(
      java.lang.String key);
}
