//click vào menutoggle
document.querySelector('.menu-toggle').addEventListener('click', function() {
    document.querySelector('.right').classList.toggle('show');
});
//chọn tips hay gallery
function showContent(target) {
    // Ẩn tất cả các phần tử nội dung
    document.getElementById('photography-tips-content').style.display = 'none';
    document.getElementById('gallery-content').style.display = 'none';
    
    // Hiển thị nội dung liên quan đến mục được chọn
    if (target === 'photography-tips') {
        document.getElementById('photography-tips-content').style.display = 'flex';
    } else if (target === 'gallery') {
        document.getElementById('gallery-content').style.display = 'flex';
    }
}
