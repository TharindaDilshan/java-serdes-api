public class SerDes {
    public static void main(String[] args) {
        ProtobufSchemaBuilder schemaBuilder = ProtobufSchema.newSchemaBuilder();
        ProtobufMessage messageBuilder = ProtobufMessage.newMessageBuilder("Student") // message Person
                .addField("required", "int32", "id", 1)		// required int32 id = 1
                .addField("required", "string", "name", 2)	// required string name = 2
                .build();

        schemaBuilder.addMessageToProtoSchema(messageBuilder);
//        ProtobufSchema schema = schemaBuilder.build();

        System.out.println(messageBuilder.toString());
    }
}
