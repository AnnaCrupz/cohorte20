const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
const name_ = document.querySelector('.name');
const blog = document.querySelector('.blog');
//const $l = document.querySelector('.location');

async function displayUser(username) {
  name_.textContent = 'cargando...';
  const response = await fetch(`${usersEndpoint}/${username}`);
  console.log(data);
  name_.textContent = `${data.name}`;
  blog.textContent = `${data.blog}`;
  //$l.textContent = `${data.location}`;
} 

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  $n.textContent = `Algo salió mal:  ${err}`;
}

displayUser('stolinski').catch(handleError);