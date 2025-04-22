(function ($) {
  "use strict";

  // Spinner
  var spinner = function () {
    setTimeout(function () {
      if ($("#spinner").length > 0) {
        $("#spinner").removeClass("show");
      }
    }, 1);
  };
  spinner();

  // Initiate the wowjs
  new WOW().init();

  // Fixed Navbar
  $(window).scroll(function () {
    if ($(window).width() < 992) {
      if ($(this).scrollTop() > 45) {
        $(".fixed-top").addClass("bg-white shadow");
      } else {
        $(".fixed-top").removeClass("bg-white shadow");
      }
    } else {
      if ($(this).scrollTop() > 45) {
        $(".fixed-top").addClass("bg-white shadow").css("top", -45);
      } else {
        $(".fixed-top").removeClass("bg-white shadow").css("top", 0);
      }
    }
  });

  // Back to top button
  document.querySelector(".back-to-top").addEventListener("click", function (e) {
    e.preventDefault();
    window.scrollTo({
      top: 0,
      behavior: "smooth", // Thêm hiệu ứng cuộn mượt mà
    });
  });

  // Testimonials carousel
  $(".testimonial-carousel").owlCarousel({
    autoplay: true,
    smartSpeed: 1000,
    margin: 25,
    loop: true,
    center: true,
    dots: false,
    nav: true,
    navText: ['<i class="bi bi-chevron-left"></i>', '<i class="bi bi-chevron-right"></i>'],
    responsive: {
      0: {
        items: 1,
      },
      768: {
        items: 2,
      },
      992: {
        items: 3,
      },
    },
  });
})(jQuery);
///

$(document).ready(function () {
  $(".method").on("click", function () {
    $(".method").removeClass("blue-border");
    $(this).addClass("blue-border");
  });
});
var $cardInput = $(".input-fields input");

$(".next-btn").on("click", function (e) {
  $cardInput.removeClass("warning");

  $cardInput.each(function () {
    var $this = $(this);
    if (!$this.val()) {
      $this.addClass("warning");
    }
  });
});

document.addEventListener("DOMContentLoaded", function() {
  const urlParams = new URLSearchParams(window.location.search);
  if (urlParams.get("logout") === "true") {
    alert("Bạn đã đăng xuất thành công!");
  }
});

document.addEventListener("DOMContentLoaded", function () {
  function truncateText(selector, maxLines) {
    document.querySelectorAll(selector).forEach(el => {
      let lineHeight = parseFloat(window.getComputedStyle(el).lineHeight);
      let maxHeight = lineHeight * maxLines;
      let originalText = el.getAttribute("data-original-text") || el.textContent.trim();

      el.setAttribute("data-original-text", originalText); // Lưu văn bản gốc
      el.style.maxHeight = maxHeight + "px";
      el.textContent = originalText; // Khôi phục nội dung gốc trước khi cắt

      while (el.scrollHeight > maxHeight && originalText.length > 0) {
        originalText = originalText.slice(0, -1).trim(); // Xóa từng ký tự một
        el.textContent = originalText + "...";
      }
    });
  }

  // Áp dụng khi tải trang
  truncateText(".text-limit", 3);

  // Áp dụng lại khi chuyển tab
  document.querySelectorAll('.nav-pills a').forEach(tab => {
    tab.addEventListener('shown.bs.tab', function () {
      truncateText(".text-limit", 3);
    });
  });
});

//khong load trang khi them san pham vao gio hang
$(document).ready(function() {
  // Khi trang đã load xong
  $(document).on('click', '.btn-add-to-cart', function(e) {
    e.preventDefault();
    const productId = $(this).data('id'); // Lấy ID sản phẩm từ data-id

    // Gửi request thêm sản phẩm vào giỏ hàng
    $.getJSON(`/shopping-cart/addAjax/${productId}`, function(resp) {
      alert(resp.message);         // Hiển thị thông báo thành công hoặc thất bại
    });
  });
});


//khong load trang khi tang giam xóa
$(function(){
  function formatVND(x){
    return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",") + " đ";
  }

  // Tăng số lượng
  $(".quantity-right-plus").click(function(e){
    e.preventDefault();
    const id = $(this).data("id");
    $.getJSON(`/shopping-cart/increase/${id}`, function(resp){
      $(`#quantity-${id}`).val(resp.quantity);
      $(`#lineTotal-${id}`).text(formatVND(resp.lineTotal));
      $("#cartSubtotal, #cartTotal").text(formatVND(resp.cartTotal));
    });
  });

  // Giảm số lượng
  $(".quantity-left-minus").click(function(e){
    e.preventDefault();
    const id = $(this).data("id");
    $.getJSON(`/shopping-cart/decrease/${id}`, function(resp){
      $(`#quantity-${id}`).val(resp.quantity);
      $(`#lineTotal-${id}`).text(formatVND(resp.lineTotal));
      $("#cartSubtotal, #cartTotal").text(formatVND(resp.cartTotal));
    });
  });

  // Xóa sản phẩm
  $(".btn-remove").click(function(e){
    e.preventDefault();
    const id = $(this).data("id");
    $.getJSON(`/shopping-cart/remove/${id}`, function(resp){
      $(`tr[data-product-id="${id}"]`).remove();
      $("#cartSubtotal, #cartTotal").text(formatVND(resp.cartTotal));
    });
  });
});



