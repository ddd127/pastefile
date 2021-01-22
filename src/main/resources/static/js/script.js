function submit_button() {
    const file_input = document.getElementById("file_input");
    const file = file_input.files[0];
    if (file === undefined) {
        return;
    }
    const form_data = new FormData();
    form_data.append("file", file);
    fetch('/', { method: "POST", body: form_data })
        .then(r => r.json())
        .then(json => handleRequest(window.location.href + json.url));
}

function handleRequest(url) {
    const label = document.getElementById("file_label");
    const button = document.getElementById("submit_button");
    label.innerText = url;
    button.innerText = 'Copy';
    button.onclick = () => {
        const res = copy_to_clipboard(url);
        if (res) {
            button.innerText = "Copied!";
        }
    };
}

function copy_to_clipboard(text) {
    const text_area = document.createElement("textarea");
    text_area.value = text;

    // Avoid scrolling to bottom
    text_area.style.top = "0";
    text_area.style.left = "0";
    text_area.style.position = "fixed";

    document.body.appendChild(text_area);
    text_area.focus();
    text_area.select();

    let result;
    try {
        result = document.execCommand('copy');
    } catch (err) {
        result = false;
    }

    document.body.removeChild(text_area);
    return result;
}

function body_onload() {
    const file_input = document.getElementById('file_input');
    const file_label = document.getElementById('file_label');
    const max_length = 15;

    const labelVal = file_label.innerHTML;

    file_input.addEventListener('change', () => {
        const file_name = file_input.value.split('\\').pop();
        if (file_name)
            file_label.innerHTML = (file_name.length > max_length
                ? (file_name.substring(0, max_length - 3) + "...")
                : file_name);
        else
            file_label.innerHTML = labelVal;
    });
}
