document.getElementById("productForm").addEventListener("submit", function (event) {
  event.preventDefault();

  const productName = document.getElementById("productName").value;
  const productPrice = document.getElementById("productPrice").value;
  const productDescription = document.getElementById("productDescription").value;
  const productImage = document.getElementById("productImage").value; // Vẫn giữ trường này nếu bạn cần nhập đường dẫn hình ảnh

  const productList = document.getElementById("productList");
  const listItem = document.createElement("li");
  listItem.className = "product-item";

  listItem.innerHTML = `
        <img src="${productImage}" alt="${productName}" style="width: 50px; height: 50px; object-fit: cover; margin-right: 10px;">
        <div>
            <strong>${productName}</strong><br>
            Giá: ${productPrice} VNĐ<br>
            Mô tả: ${productDescription}<br>
        </div>
        <button class="delete-button">Xóa</button>
    `;

  productList.appendChild(listItem);

  // Xóa sản phẩm
  listItem.querySelector(".delete-button").addEventListener("click", function () {
    productList.removeChild(listItem);
  });

  // Reset form
  document.getElementById("productForm").reset();
});
