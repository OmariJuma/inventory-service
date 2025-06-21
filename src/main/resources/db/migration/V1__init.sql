CREATE TABLE "inventory" (
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    sku varchar(255) NOT NULL,
    quantity int NOT NULL,
    price decimal(19,2) NOT NULL
);