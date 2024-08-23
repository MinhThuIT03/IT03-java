document.addEventListener('DOMContentLoaded', () => {
    fetch('te.json')
        .then(response => response.json())
        .then(data => {
            const container = document.getElementById('posts-container');
            data.forEach(post => {
                const postElement = document.createElement('div');
                postElement.classList.add('post');
                postElement.innerHTML = `
                    <h2>${post.title}</h2>
                    <p>${post.content}</p>
                `;
                container.appendChild(postElement);
            });
        })
        .catch(error => console.error('Error:', error));
});

