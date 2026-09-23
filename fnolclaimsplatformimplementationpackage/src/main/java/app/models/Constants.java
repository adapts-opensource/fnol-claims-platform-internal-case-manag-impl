// Feature: Internal Case Management:decision:state_transition
package app.config.decision;

public final class DecisionConstants {
    private DecisionConstants() {}

    public static final String DECISION_TABLE = "admin-backend_table";
    public static final String AUDIT_TABLE = "audit-logger_table";
    public static final String PK_ATTR = "pk";
    public static final String SK_ATTR = "sk";
    public static final String ID_ATTR = "id";
    public static final String PAYLOAD_ATTR = "payload";
    public static final String STATE_ATTR = "currentState";
    public static final String VERSION_ATTR = "version";
    public static final String TENANT_ATTR = "tenantId";
    public static final String CLAIM_ATTR = "claimNumber";
    public static final String POLICY_ATTR = "policyNumber";
    public static final String ACTOR_ATTR = "actorId";
    public static final String ROLE_ATTR = "actorRole";
    public static final String TIMESTAMP_ATTR = "timestamp";
    public static final String ACTION_ATTR = "action";
}
