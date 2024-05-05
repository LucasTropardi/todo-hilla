import { createBrowserRouter } from "react-router-dom";
import { TodoView } from "./views/TodoView";

const router = createBrowserRouter([
    {path: '/', element: <TodoView/>},
]);

export default router;
