package io.getarrays.securecapita.query;

public class PurchaseQuery {
    public static final String SELECT_PURCHASE_REQUESTS_BY_ID_QUERY ="SELECT * FROM PurchaseRequisition WHERE id = :id";
    public static final String INSERT_PurchaseRequisition_REQUEST_QUERY = "INSERT INTO PurchaseRequisition (user_id, date, department_code, reason, item_number, Item_description, unit_price, quantity, estimated_value, receiver_email, signature) VALUES (:userId, :date, :departmentCode, :reason, :itemNumber, :itemDescription, :unitPrice, :quantity, :estimatedValue, :receiverEmail, :signature)";
}
